package srl.neotech.autosalone.services;

import java.util.Random;


import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String randomimg1(){
        String img1="";
        Random r=new Random();
        Integer numerorandom=r.nextInt(2);
        if(numerorandom==1){
            img1="/home/neotech/Downloads/mini-coupe-driving-highway-accross-mountains.jpg";
        }
        if (numerorandom==2) {
            img1="/home/neotech/Downloads/mini-coupe-parking-highway-bridge.jpg";
        }
        return img1;
        
    }
    public String randomimg2(){
        String img2="";
        Random r=new Random();
        Integer numerorandom=r.nextInt(2);
        if(numerorandom==1){
            img2="/home/neotech/Downloads/mini-coupe-driving-highway-accross-mountains.jpg";
        }
        if (numerorandom==2) {
            img2="/home/neotech/Downloads/mini-coupe-parking-highway-bridge.jpg";
        }
        return img2;
        
    }
    public String randomimg3(){
        String img3="";
        Random r=new Random();
        Integer numerorandom=r.nextInt(2);
        if(numerorandom==1){
            img3="/home/neotech/Downloads/mini-coupe-driving-highway-accross-mountains.jpg";
        }
        if (numerorandom==2) {
            img3="/home/neotech/Downloads/mini-coupe-parking-highway-bridge.jpg";
        }
        return img3;
        
    }

}
