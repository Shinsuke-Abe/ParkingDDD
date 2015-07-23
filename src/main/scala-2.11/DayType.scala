import java.util.{Calendar, Date}

/**
 * @author mao.instantlife at gmail.com
 */
trait DayType {
  val dayTypeRange: Range

  def isDayType(loadingDate: Date): Boolean = {
    val cal = Calendar.getInstance()
    cal.setTime(loadingDate)

    dayTypeRange contains cal.get(Calendar.DAY_OF_WEEK)
  }
}

object WeekDay extends DayType {
  override val dayTypeRange: Range = 2 to 6
}

object Holiday extends DayType {
  override val dayTypeRange: Range = Range(1, 7)
}