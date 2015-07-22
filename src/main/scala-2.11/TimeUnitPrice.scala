import java.util.Date

/**
 * @author mao.instantlife at gmail.com
 */
case class TimeUnitPrice(unitPrice: Int, startTime: Date, endTime: Date)

object TimeUnitPriceRepository {
  def findByStartTime(startTime: Date): TimeUnitPrice = null
}
