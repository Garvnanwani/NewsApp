package farees.hussain.newsapp.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import farees.hussain.newsapp.R
import farees.hussain.newsapp.databinding.FragmentSavedNewsBinding
import farees.hussain.newsapp.databinding.FragmentSearchNewsBinding

class SearchNewsFragment : Fragment() {

    private lateinit var binding : FragmentSearchNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_search_news,container,false)



        return binding.root
    }


}