package naturalistic.lang

@naturalistic.lang.annotations.Adjective(name = "Entity")
trait Entity extends naturalistic.sql.DBEntity {}
@naturalistic.lang.annotations.Adjective(name = "Persistent")
trait Persistent extends naturalistic.sql.DBPersistent {}