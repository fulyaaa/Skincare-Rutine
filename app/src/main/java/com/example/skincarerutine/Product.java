package com.example.skincarerutine;

import java.io.Serializable;

public class Product implements Serializable {

   int imageView;
   String skinTypeText;
   int imageView1;
   int imageView2;
   int imageView3;
   int imageView4;
   String product1;
   String product2;
   String product3;
   String product4;

   public Product(int imageView, String skinTypeText, int imageView1, int imageView2, int imageView3,
                  int imageView4, String product1, String product2, String product3, String product4){
      this.imageView = imageView;
      this.skinTypeText = skinTypeText;
      this.imageView1 = imageView1;
      this.imageView2 = imageView2;
      this.imageView3 = imageView3;
      this.imageView4 = imageView4;
      this.product1 = product1;
      this.product2 = product2;
      this.product3 = product3;
      this.product4 = product4;
   }
}
