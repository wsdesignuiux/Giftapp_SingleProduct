package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.wolfsoft.giftapp_singleproduct.R;

import java.util.ArrayList;

import model.Single_Product_Model;

/**
 * Created by wolfsoft4 on 14/8/18.
 */

public class Single_Product_Adapter extends RecyclerView.Adapter<Single_Product_Adapter.ViewHolder>  {

    Context context;
    private ArrayList<Single_Product_Model> single_product_modelArrayList;

    public Single_Product_Adapter(Context context, ArrayList<Single_Product_Model> single_product_modelArrayList) {
        this.context = context;
        this.single_product_modelArrayList = single_product_modelArrayList;
    }

    @Override
    public Single_Product_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_single_product,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Single_Product_Adapter.ViewHolder holder, final int position) {
        holder.imageView1.setImageResource(single_product_modelArrayList.get(position).getImageView1());
        holder.txtprice.setText(single_product_modelArrayList.get(position).getTxtprice());
        holder.txtproductname.setText(single_product_modelArrayList.get(position).getTxtproductname());
        holder.txtreviews.setText(single_product_modelArrayList.get(position).getTxtreviews());

    }

    @Override
    public int getItemCount() {
        return single_product_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView1;
        TextView txtprice,txtproductname,txtreviews;
        LinearLayout l1,l2,l3;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView1=itemView.findViewById(R.id.imageView1);
            txtprice=itemView.findViewById(R.id.txtprice);
            txtproductname=itemView.findViewById(R.id.txtproductname);
            txtreviews=itemView.findViewById(R.id.txtreviews);

            l1=itemView.findViewById(R.id.l1);
            l2=itemView.findViewById(R.id.l2);
            l3=itemView.findViewById(R.id.l3);

        }
    }
}
