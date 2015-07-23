/**
 * @author mao.instantlife at gmail.com
 */

import java.util.{GregorianCalendar, Calendar}

import org.specs2.mutable._

class DayTypeSpec extends Specification {
  "日種別判定：平日" >> {
    "入庫日が月曜日の場合はtrueとなる" >> {
      val loadingDate = new GregorianCalendar(2015, 7 - 1, 27)

      WeekDay.isDayType(loadingDate.getTime) must beTrue
    }

    "入庫日が金曜日の場合はtrueとなる" >> {
      val loadingDate = new GregorianCalendar(2015, 7 - 1, 31)

      WeekDay.isDayType(loadingDate.getTime) must beTrue
    }

    "入庫日が土曜日の場合はfalseとなる" >> {
      val loadingDate = new GregorianCalendar(2015, 8 - 1, 1)

      WeekDay.isDayType(loadingDate.getTime) must beFalse
    }
  }
}
