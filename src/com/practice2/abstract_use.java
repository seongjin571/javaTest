package com.practice2;

public class abstract_use extends abstract_practice{
    int height;
    int weight;
            @Override
            public void bird() {
                System.out.println("오리");
        }
    abstract_use(){
                System.out.println("오리오리");
    }
    public void size(int height,int weight){
            this.height=height;
            this.weight=weight;
        }
    }
