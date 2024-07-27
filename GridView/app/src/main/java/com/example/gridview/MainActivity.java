package com.example.gridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private GalleryAdapter adapter;
    private List<GalleryItem> galleryItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);
        galleryItems = new ArrayList<>();

        // Adding gallery items
        galleryItems.add(new GalleryItem(R.drawable.image1, "Nap King", "Caught in the act of royal laziness."));
        galleryItems.add(new GalleryItem(R.drawable.image2, "Drama Queen", "Expressing the existential crisis of being out of treats."));
        galleryItems.add(new GalleryItem(R.drawable.image3, "Whisker Spy", "Secret agent on a mission for catnip."));
        galleryItems.add(new GalleryItem(R.drawable.image4, "Meow-sician", "Practicing for the next cat symphony."));
        galleryItems.add(new GalleryItem(R.drawable.image5, "The Pawsinator", "I'll be back... for more treats."));
        galleryItems.add(new GalleryItem(R.drawable.image6, "Box Enthusiast", "If I fits, I sits."));
        galleryItems.add(new GalleryItem(R.drawable.image7, "Curiosity Master", "What's in the bag? Only one way to find out."));
        galleryItems.add(new GalleryItem(R.drawable.image8, "Yoga Cat", "Mastering the art of flexibility."));
        galleryItems.add(new GalleryItem(R.drawable.image9, "Invisible Enemy", "Who says cats can't see ghosts?"));
        galleryItems.add(new GalleryItem(R.drawable.image10, "Purrito", "When you wrap a cat like a burrito."));

        adapter = new GalleryAdapter(this, galleryItems);
        gridView.setAdapter(adapter);
    }
}
