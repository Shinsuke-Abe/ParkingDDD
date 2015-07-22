import java.util.Date

/**
 * @author mao.instantlife at gmail.com
 */
case class TimeUnitPrice(unitPrice: Int, startTime: Date, endTime: Date)

object TimeUnitPriceRepository {
  // TODO
  def findByLoadingTime(loadingTime: Date): TimeUnitPrice = new TimeUnitPrice(100, new Date, new Date)
}
