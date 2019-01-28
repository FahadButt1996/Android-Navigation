package com.example.fahadwaqar.navigationjetpack


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_mcq.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MCQFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mcq, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        mcq_btn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_ic_mcq_to_ic_past_paper))
          // method to pass the data using bundle (Old Approach)
//            mcq_btn.setOnClickListener({
//                val bundleToTransfer = Bundle()
//                if(!name.text.isEmpty()) {
//                    bundleToTransfer.putString("name_arg", name.text.toString())
//                } else {
//                    bundleToTransfer.putString("name_arg", "User Didn't enter any name")
//                }
//                it.findNavController().navigate(R.id.action_ic_mcq_to_ic_past_paper , bundleToTransfer)
//            })


        // method to pass data using SafeArg (Better approach)
        mcq_btn.setOnClickListener({
            val action = MCQFragmentDirections.actionIcMcqToIcPastPaper()
            if(!name.text.isEmpty()) {
                action.setNameArg(name.text.toString())
            } else {
                action.setNameArg( "User Didn't enter any name" )
            }
            findNavController().navigate(action)
        })
    }
}
