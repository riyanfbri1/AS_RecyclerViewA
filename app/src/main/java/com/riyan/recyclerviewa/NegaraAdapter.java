package com.riyan.recyclerviewa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class NegaraAdapter extends RecyclerView.Adapter<NegaraViewHolder> {

    private Context _context;
    private List<NegaraModel> _negaraModelList;

    public NegaraAdapter(Context _context, List<NegaraModel> _negaraModelList) {
        this._context = _context;
        this._negaraModelList = _negaraModelList;
    }

    @NonNull
    @Override
    public NegaraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.layout_negara, parent, false);
        return new NegaraViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NegaraViewHolder holder, int position) {
        NegaraModel nm = _negaraModelList.get(position);
        Picasso.with(_context).load(nm.getUrl()).into(holder._imageView1);
        holder._namaTextView.setText(nm.getNama());
        holder._deskripsiTextView.setText(nm.getDeskripsi());
    }

    @Override
    public int getItemCount() {
        int itemCount = 0;

        if (_negaraModelList !=null)
        {
            itemCount = _negaraModelList.size();
        }
        return itemCount;
    }
}
