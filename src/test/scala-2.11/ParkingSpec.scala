/**
 * @author mao.instantlife at gmail.com
 */

import org.specs2.mutable._

class ParkingSpec extends Specification {

  "入庫処理をする" >> {
    "入庫可能な場合は新しい入出庫データを作る" >> {
      Parking.loading must beRight
    }
  }


  "出庫処理をする" >> {
    "入庫時間帯から料金を計算する" >> {
      // TODO 単なるシナリオ(後で整備)
      Parking.loading match {
        case Right(loading) => Parking.unloading(loading.id) must equalTo(100)
      }
    }

    // TODO 出庫時間の記録は？
  }
}
