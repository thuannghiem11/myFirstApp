package com.example.myfirstcoolproject.adapter;

import androidx.recyclerview.widget.RecyclerView ;
import android.view.ViewGroup;
import androidx.annotation.NonNull ;


public class MedicineAdapter extends RecyclerView.Adapter<MedicineAdapter.MedicineViewHolder> {
    @NonNull
    @Override
    public MedicineAdapter.MedicineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MedicineAdapter.MedicineViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // Đây là cái khuôn (ViewHolder) mà bạn cần thêm vào
    public static class MedicineViewHolder extends RecyclerView.ViewHolder {
        public MedicineViewHolder(@NonNull android.view.View itemView) {
            super(itemView);
            // Sau này bạn sẽ khai báo các thành phần trong 1 dòng ở đây (ví dụ: TextView tên thuốc)
        }
    }
}
