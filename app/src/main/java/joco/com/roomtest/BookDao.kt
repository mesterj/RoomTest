package joco.com.roomtest

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface BookDao {

    @Query("SELECT * from Books ORDER BY isbn ASC")
    fun getBooksbyIsbn(): LiveData<List<Book>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Book)

    @Query("DELETE FROM Books")
    suspend fun deleteAll()

    //@Update("")
}