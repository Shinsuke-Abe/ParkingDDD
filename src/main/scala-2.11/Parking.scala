import java.util.Date

/**
 * @author mao.instantlife at gmail.com
 */
object Parking {
  val loadingLimit = 10

  def loading: Either[Exception, Loading] = {
    if(LoadingRepository.nowLoadings.length >= loadingLimit) Left(new Exception)
    else Right(LoadingFactory.create(new Date))
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
