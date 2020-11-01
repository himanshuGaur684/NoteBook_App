package gaur.himanshu.august.notebook.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Entity
@Parcelize
class NoteBook(
    val title: String,
    val desc: String?
) :Parcelable{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}