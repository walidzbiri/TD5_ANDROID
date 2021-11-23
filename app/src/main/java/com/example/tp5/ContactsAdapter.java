package com.example.tp5;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {


    public static class ViewHolder extends  RecyclerView.ViewHolder{

        public TextView prenomView;
        public TextView nomView;
        public ImageView imageView;
        public Context myActivity;

        public ViewHolder(@NonNull View itemView,Context context) {
            super(itemView);

            this.prenomView = (TextView) itemView.findViewById(R.id.prenom);
            this.nomView = (TextView) itemView.findViewById(R.id.nom);
            this.imageView = (ImageView) itemView.findViewById(R.id.image);
            this.myActivity=context;
        }
    }

    private final List<Contact> mContacts;
    public ContactsAdapter(List<Contact> mContacts) {
        this.mContacts = mContacts;
    }



    @NonNull
    @Override
    public ContactsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View contactView=inflater.inflate(R.layout.item_contact,parent,false);
        return new ViewHolder(contactView,context);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsAdapter.ViewHolder holder, int position) {
        Contact contact =mContacts.get(position);

        TextView prenomTextView=holder.prenomView;
        prenomTextView.setText(contact.getPrenom());

        TextView nomTextView=holder.nomView;
        nomTextView.setText(contact.getNom());

        ImageView imageView=holder.imageView;
        Glide.with(holder.myActivity)
                .load(contact.getImageUrl())
                .into(imageView);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
