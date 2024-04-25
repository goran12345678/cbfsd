package com.aws.awss3demo;

import java.util.Iterator;
import java.util.List;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class S3Util {
	public static void listBucketsInS3() {
		try {
			AmazonS3 s3Ref = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_2).build();
			List<Bucket> bucketList = s3Ref.listBuckets();
			
			System.out.println("Buckets in S3: " + bucketList.size());
			bucketList.forEach((bucket) -> System.out.println(bucket.getName()));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void createBucketInS3(String bucketName) {
		try{
			AmazonS3 s3Ref = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_2).build();
			s3Ref.createBucket(bucketName);
			System.out.println("bucket creawte with name: " + bucketName);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteEmptyBucket(String bucketName) {
		
		try {
			AmazonS3 s3Ref = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_2).build();
			s3Ref.deleteBucket(bucketName);
			
		}catch(Exception e) {
			
		}
	}
	public static void deleteFilledBucket(String bucketName) {
		try {
			AmazonS3 s3Ref = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_2).build();
			ObjectListing listing = s3Ref.listObjects(bucketName);
			Iterator<S3ObjectSummary> iterator = listing.getObjectSummaries().iterator();
			while(iterator.hasNext()) {
				S3ObjectSummary summary = iterator.next();
				s3Ref.deleteObject(bucketName, summary.getKey());
			}
			System.out.println("Objects removed from S3 bucket " + bucketName);
		}catch(Exception e) {
			
		}
	}

}
