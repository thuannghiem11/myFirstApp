package com.example.myfirstcoolproject.adapter;

import androidx.recyclerview.widget.RecyclerView ;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull ;
import com.example.myfirstcoolproject.R;
import com.example.myfirstcoolproject.model.Medicine;
import java.util.List ;


public class MedicineAdapter extends RecyclerView.Adapter<MedicineAdapter.MedicineViewHolder> {

    private List<Medicine> MedicineList ;

    public MedicineAdapter(List<Medicine> List){
        this.MedicineList = List ;
    }


    @NonNull
    @Override
    //this function create view
    public MedicineAdapter.MedicineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //use LayoutInflater to take xml which I've desgined, bind it to an object View
       View view = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.morning_container, parent, false) ;

       return new MedicineViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MedicineAdapter.MedicineViewHolder holder, int position) {

        //1.Get data for this specific position
        Medicine currentItem = MedicineList.get(position) ;

        //2.bind the data to the views inside the viewHolder
        holder.txtMedicineName.setText(currentItem.getName()) ;
        holder.txtReminder.setText(currentItem.getReminder());


    }

    @Override
    public int getItemCount() {
        if(MedicineList == null){
            return 0 ;
        }
        else return MedicineList.size() ;
    }

    // Đây là cái khuôn (ViewHolder) mà bạn cần thêm vào
    public static class MedicineViewHolder extends RecyclerView.ViewHolder {
        TextView txtMedicineName ;
        TextView txtReminder ;
        public MedicineViewHolder(@NonNull android.view.View itemView) {
            super(itemView);
            // Sau này bạn sẽ khai báo các thành phần trong 1 dòng ở đây (ví dụ: TextView tên thuốc)

            txtMedicineName = itemView.findViewById((R.id.txtMedicineName)) ;
            txtReminder = itemView.findViewById((R.id.txtReminder)) ;
        }
    }


}
