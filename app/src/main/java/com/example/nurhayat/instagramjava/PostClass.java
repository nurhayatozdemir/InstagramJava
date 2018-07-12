package com.example.nurhayat.instagramjava;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/*
public class PostClass extends ArrayAdapter<String> {

    private final ArrayList<String> useremail;
    private final ArrayList<String> userImage;
    private final ArrayList<String> userComment;
    private final Activity context;
    ImageView imageView;

    public PostClass(ArrayList<String> useremail, ArrayList<String> userImage, ArrayList<String> userComment, Activity context) {
        super(context,R.layout.custom_view,useremail);
        this.useremail = useremail;
        this.userImage = userImage;
        this.userComment = userComment;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view, null,true);

        TextView useremailText = (TextView) customView.findViewById(R.id.postUserNameText);
        TextView commentText = (TextView) customView.findViewById(R.id.postCommentText);
        imageView = customView.findViewById(R.id.postView);

        useremailText.setText(useremail.get(position));
        commentText.setText(userComment.get(position));

        Picasso.get().load(userImage.get(position)).into(imageView);

        return customView;

    }
} */


public class PostClass extends ArrayAdapter<String> {

    private final ArrayList<String> useremail;
    private final ArrayList<String> userImage;
    private final ArrayList<String> userComment;
    private final Activity context;
    TextView useremailText;
    TextView commentText;
    ImageView imageView;

    public PostClass(ArrayList<String> useremail, ArrayList<String> userImage, ArrayList<String> userComment, Activity context) {
        super(context, R.layout.custom_view,useremail);
        this.useremail = useremail;
        this.userImage = userImage;
        this.userComment = userComment;
        this.context = context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view,null,true);

        useremailText =  customView.findViewById(R.id.postUserNameText);
        commentText =  customView.findViewById(R.id.postCommentText);
        imageView =  customView.findViewById(R.id.postView);

        useremailText.setText(useremail.get(position));
        commentText.setText(userComment.get(position));

        Picasso.get().load(userImage.get(position)).into(imageView);


        return customView;
    }

}

