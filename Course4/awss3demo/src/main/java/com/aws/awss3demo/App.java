package com.aws.awss3demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to AWS SDL Demo" );

        //S3Util.createBucketInS3("aws-demo-bucket-again");
        
        //S3Util.deleteEmptyBucket("aws-demo-bucket-again");
        
        S3Util.deleteFilledBucket("my-demo-bucket-for-sdk");
        
        S3Util.listBucketsInS3();
    }
}
