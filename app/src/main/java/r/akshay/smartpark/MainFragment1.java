package r.akshay.smartpark;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainFragment1 extends Fragment {
    private static final String TAG = "Tab1Fragment";

    private Button btnTEST;
    //    private Spinner myspinner;
    public String selected;
    List<dataofbooks> dataofbooksList;
    RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout,container,false);
//        btnTEST = (Button) view.findViewById(R.id.buttonf1);

        recyclerView = view.findViewById(R.id.rateview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataofbooksList = new ArrayList<>();
        dataofbooksList.add(new dataofbooks(1016, "Gandhinagar", "12 km", "8", 4.4, R.drawable.ic_launcher_background));
        dataofbooksList.add(new dataofbooks(1016, "JP Nagar", "1 km", "10", 5, R.drawable.bestbrielly));
        dataofbooksList.add(new dataofbooks(1016, "VIT SJT ", "2.4 km", "9", 4.1, R.drawable.androiddev));
        dataofbooksList.add(new dataofbooks(1016, "VIT TT ", "2.4 km", "9", 4.1, R.drawable.androiddev));
        dataofbooksList.add(new dataofbooks(1016, "Golden Temple ", "12.4 km", "9", 4.1, R.drawable.androiddev));

//        dataofbooksList.add(new dataofbooks(1016, "Building iPhone Apps with HTML, CSS and JavaScript", "Detailed, but bad for beginners", 2.9, R.drawable.iphoneappsorielly));
//        dataofbooksList.add(new dataofbooks(1016, "Android for programmers", "Detailed, but bad for beginners", 1.9, R.drawable.aforbeginners));
//        dataofbooksList.add(new dataofbooks(1016, "Guide for iOS-Apple developers", "Detailed, but bad for beginners", 2.5, R.drawable.iosdev));

        SearchProductAdapter adapter = new SearchProductAdapter(getActivity(), dataofbooksList);
        recyclerView.setAdapter(adapter);

//        private final View.OnClickListener mOnClickListener = new MyOnClickListener();
//
//        @Override
//        public MyViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
//            View view = LayoutInflater.from(mContext).inflate(R.layout.myview, parent, false);
//            view.setOnClickListener(mOnClickListener);
//            return new MyViewHolder(view);
//        }

//        Spinner myspinner= view.findViewById(R.id.spinner1);
//        ArrayAdapter<String> myada = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
//        myada.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        myspinner.setAdapter(myada);
//        myspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
//                selected= adapterView.getItemAtPosition(pos).toString();
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });
//
//        btnTEST.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 1 "+selected,Toast.LENGTH_SHORT).show();
////                Bundle bundle= new Bundle();
////                bundle.putString("chosen",selected);
////                MainFragment1 farg= new MainFragment1();
////                farg.setArguments(bundle);
////                Intent intent=new Intent(getActivity(),RateResult.class).putExtra("chosen",selected);
////                startActivity(intent);
//            }
//        });
        return view;
    }
}
