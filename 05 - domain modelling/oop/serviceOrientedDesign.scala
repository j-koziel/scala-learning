trait SubjectObserver:
  //  abstract type members
  type S <: Subject
  type O <: Observer

  //  nested traits
  private var observers: List[O] = List()
  //    This is a self-type annotation which means it requires subtypes of "Subject" to also be subtypes of "S"
  trait Subject:
    self: S =>
    def subscribe(obs: O): Unit =
      observers = obs :: observers

    def publish() =
      for obs <- observers do obs.notify(this)


  trait Observer:
    def notify(sub: S): Unit

object SensorReader extends SubjectObserver:
  type S = Sensor
  type O = Display

  class Sensor(val label: String) extends Subject:
    private var currentValue = 0.0
    def value = currentValue
    def changeValue(v: Double) =
      currentValue = v
      publish()

  class Display extends Observer:
    def notify(sub: Sensor) =
      println(s"${sub.label} has value ${sub.value}")


@main def output(): Unit =
//  using the components
  val s1 = SensorReader.Sensor("sensor1")
  val s2 = SensorReader.Sensor("sensor1")
  val d1 = SensorReader.Display()
  val d2 = SensorReader.Display()

  s1.subscribe(d1)
  s1.subscribe(d2)
  s2.subscribe(d1)

  s1.changeValue(2)
  s1.changeValue(3)

