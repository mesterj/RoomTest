package joco.com.roomtest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Books")
class Book(
    @PrimaryKey
    @ColumnInfo(name = "isbn") val isbn : String)
{
    @ColumnInfo(name = "cím") var cim: String = ""
    @ColumnInfo(name = "kiadáséve") var kiadasev : Int = 0
    @ColumnInfo(name = "szerzoneve") var szerzonev : String = ""
}