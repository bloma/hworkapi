package domain.common.demographics

/**
 * Created by hashcode on 2015/11/07.
 */
import play.api.libs.json.Json

case class MaritalStatus(maritalStatusId:String,name:String)

object MaritalStatus{
  implicit val maritFmt = Json.format[MaritalStatus]
}
