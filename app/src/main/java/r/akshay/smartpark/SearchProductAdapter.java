package r.akshay.smartpark;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static android.content.ContentValues.TAG;

public class SearchProductAdapter extends RecyclerView.Adapter<SearchProductAdapter.ProductViewHolder> {
        private Context mCtx;
        private List<dataofbooks> dataofbooksList;
//        FragmentManager manager = getSupportFragmentManager();
//        android.support.v4.app.FragmentTransaction t = manager.beginTransaction();
        public SearchProductAdapter(Context mCtx, List < dataofbooks > dataofbooksList) {
        this.mCtx = mCtx;
        this.dataofbooksList = dataofbooksList;
    }
        public ProductViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.customlayout, null);
        return new ProductViewHolder(view);
    }
        public void onBindViewHolder (ProductViewHolder holder, final int position){
        dataofbooks product = dataofbooksList.get(position);
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewShortDesc.setText(product.getShortdesc());
        holder.textViewRating.setRating((float) product.getRating());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));
        holder.textViewInfo.setText(product.getInfo());

        }
        public int getItemCount () {
        return dataofbooksList.size();
    }
        class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

            TextView textViewTitle, textViewShortDesc, textViewInfo;
            RatingBar textViewRating;
            ImageView imageView;

            public ProductViewHolder(View itemView) {
                super(itemView);

                textViewTitle = itemView.findViewById(R.id.texttb);
                textViewInfo = itemView.findViewById(R.id.textinfo);
                textViewShortDesc = itemView.findViewById(R.id.textrea);
                textViewRating = itemView.findViewById(R.id.ratingbar);
                imageView = itemView.findViewById(R.id.thumbnail);
                itemView.setOnClickListener(this);

            }

            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) { // Check if an item was deleted, but the user clicked it before the UI removed it
                    Toast.makeText(mCtx, textViewTitle.getText(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mCtx, details.class);
                    intent.putExtra("Location name", textViewTitle.getText());
                    mCtx.startActivity(intent);
//                    Fragment m4 = new MainFragment2();
//                    Bundle b4 = new Bundle();
//                    b4.putString("yo", textViewTitle.getText());
//                    m4.setArguments(b4);
//                    t.add(R.)

                }
        }
    }}
