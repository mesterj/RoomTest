package joco.com.roomtest

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface BookDao {

    @Query("SELECT * from Books ORDER BY isbn ASC")
    fun getBooksbyIsbn(): LiveData<List<Book>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(word: Book)

    @Query("DELETE FROM Books")
    suspend fun deleteAll()

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertorreplaceAllBook(booklist: List<Book>)

    //@Update("")
}