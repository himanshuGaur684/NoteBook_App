package gaur.himanshu.august.notebook.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.navigation.NavController
import androidx.navigation.Navigation
import gaur.himanshu.august.notebook.R
import gaur.himanshu.august.notebook.model.NoteBook

class EditFragment : Fragment() {

    lateinit var navController: NavController
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      navController=Navigation.findNavController(view)
        val noteBook=requireArguments().get("note_book") as NoteBook
        val title=view.findViewById<EditText>(R.id.edit_title)
        val desc=view.findViewById<EditText>(R.id.edit_desc)

        title.setText(noteBook.title)
        desc.setText(noteBook.desc)

    }


}