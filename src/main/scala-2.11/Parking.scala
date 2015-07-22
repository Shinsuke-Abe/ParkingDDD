import java.util.Date

/**
 * @author mao.instantlife at gmail.com
 */
object Parking {
  val loadingLimit = 10

  import LoadingRepository._
  import LoadingRule._

  def loading: Either[Exception, Loading] = {
    if (isLoadable(nowLoadings.length, loadingLimit)) Right(LoadingFactory.create(new Date))
    else Left(new Exception)
  }

  def unloading(loadingId: Int): Int = {
    // TODO テスト未整備のためコメント
//    val loading = LoadingRepository.findById(loadingInt)
//
//    UnitPriceRepository.findByLoadingTime(loading)

    // TODO 料金計算

    100
  }
}
