package com.search;

/*
We can do binary search using any of the below templates. while some templates have and edge over the others on a specific problem
There are three templates.
1.Where hi crosses lo [hi . lo]
2.Both hi and low point to the same element  low->element<-hi
3.Hi and Low are adjacent to each other  low->element|element<-hi

*/ 

public class binarySearchTemplates {
    //binary search firt template
    // In the end, lo crosses hi , so nohting left to explore "hi . lo"
    public static int binarySearch_FirstTemplate(int[] arr,int target){
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target){lo = mid+1;}
            else {hi = mid-1;}
        }
        return -1;
    }

    //Second Template
    //In the end lo and hi both should point to the same element, so just one element to consider finally 
    // "lo->element<-hi "
    public static int binarySearch_SecondTemplate(int[] arr, int target){
        int lo = 0;
        int hi = arr.length;
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            
            if(arr[mid]<target)lo = mid+1; //it is okay for lo to move one step ahead of mid as that will still keep lo<=hi
            else {hi = mid;}
            //we can't do (hi=mid-1), else we can break our expectation to have at least one element in the window, e.g:[5,9, target: 4]
            // also if target is 9, we will miss that algother.
        }
        return arr[hi]==target?hi:-1;
    }

    //Third Template
    //In the end, lo remains one step left of right, so in the end, there is just two elements to consider
    public static int binarySearch_ThirdTemplate(int[] arr, int target){
        int lo = 0;
        int hi = arr.length;
        while(lo+1<hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]<target)lo=mid;
            else{hi=mid;}
        }
        if(arr[lo]!=target && arr[hi]!=target)return -1;
        else{
            return arr[lo]==target?lo:hi;
        }

    //Modified Third Template
    //One pointer always points tot he wrong element and the other always point to the possibly right element
    //In the end , just confirm whether the pointer pointing to possibly right element actually points to the right element.
        


        
    }



        public static void main(String[] args) {
            
        }

    }


