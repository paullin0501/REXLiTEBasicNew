package com.rexlite.rexlitebasicnew;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Max1Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Max1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Max1Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button btnNavFrag1;

    private Button btnNavFrag2;

    private Button btnNavFrag3;

    private OnFragmentInteractionListener mListener;

    public Max1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Max1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Max1Fragment newInstance(String param1, String param2) {
        Max1Fragment fragment = new Max1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_max1, container, false);
        btnNavFrag1 = (Button) view.findViewById(R.id.max1);
        btnNavFrag2 = (Button) view.findViewById(R.id.max2);
        btnNavFrag3 = (Button) view.findViewById(R.id.max3);


        btnNavFrag1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

               // Toast.makeText(getActivity(), "Going to Fragment 1", Toast.LENGTH_SHORT).show();

                ((Device3Activity) getActivity()).setViewPager(0);

            }

        });

        btnNavFrag2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

              //  Toast.makeText(getActivity(), "Going to Fragment 2", Toast.LENGTH_SHORT).show();

                ((Device3Activity) getActivity()).setViewPager(1);

            }

        });

        btnNavFrag3.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

               // Toast.makeText(getActivity(), "Going to Fragment 3", Toast.LENGTH_SHORT).show();

                ((Device3Activity) getActivity()).setViewPager(2);

            }

        });

       /* btnNavSecondActivity.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Toast.makeText(getActivity(), "Going to Fragment btnNavSecondActivity", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(), SecondActivtiy.class);
                startActivity(intent);

            }

        });*/

        return view;

    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

  /*  @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


public interface OnFragmentInteractionListener {
    // TODO: Update argument type and name
    void onFragmentInteraction(Uri uri);
}


}
