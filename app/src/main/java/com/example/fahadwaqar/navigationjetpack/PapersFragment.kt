package com.example.fahadwaqar.navigationjetpack


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_papers.*

class PapersFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_papers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    // when receiving data from bundle
//        name_feild.text = "Name Coming from MCQ Fragment is ::\n\n" + arguments?.getString("name_arg")

        // when receiving data from SafeArgs
        val name_arg = PapersFragmentArgs.fromBundle(arguments!!).nameArg
        name_feild.text = "Name Coming from MCQ Fragment is ::\n\n" + name_arg
    }
}
