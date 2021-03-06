//
// Copyright 2016 Amazon.com, Inc. or its affiliates (Amazon). All Rights Reserved.
//
// Code generated by AWS Mobile Hub. Amazon gives unlimited permission to 
// copy, distribute and modify it.
//
// Source code generated from template: aws-my-sample-app-android v0.9
//
package com.amazonaws.mobile;

import com.amazonaws.regions.Regions;

/**
 * This class defines constants for the developer's resource
 * identifiers and API keys. This configuration should not
 * be shared or posted to any public source code repository.
 */
public class AWSConfiguration {

    // AWS MobileHub user agent string
    public static final String AWS_MOBILEHUB_USER_AGENT =
        "MobileHub 673c80c0-ab4b-4855-baf5-562001a2247b aws-my-sample-app-android-v0.9";
    // AMAZON COGNITO
    public static final Regions AMAZON_COGNITO_REGION =
      Regions.fromName("us-east-1");
    public static final String  AMAZON_COGNITO_IDENTITY_POOL_ID =
        "us-east-1:97bc53b6-0552-4c4d-9c93-b5d0e0f0342c";
    // Custom Developer Provided Authentication ID
    public static final String DEVELOPER_AUTHENTICATION_PROVIDER_ID =
        "nao.min.com";
    // Developer Authentication - URL for Create New Account
    public static final String DEVELOPER_AUTHENTICATION_CREATE_ACCOUNT_URL =
        "aws.amazon.com";
    // Developer Authentication - URL for Forgot Password
    public static final String DEVELOPER_AUTHENTICATION_FORGOT_PASSWORD_URL =
        "aws.amazon.com";
    // Account ID
    public static final String DEVELOPER_AUTHENTICATION_ACCOUNT_ID =
        "239011130323";
    public static String DEVELOPER_AUTHENTICATION_DISPLAY_NAME = "Custom";
    // S3 BUCKET
    public static final String AMAZON_S3_USER_FILES_BUCKET =
        "nao-userfiles-mobilehub-334913915";
    // S3 BUCKET REGION
    public static final Regions AMAZON_S3_USER_FILES_BUCKET_REGION =
        Regions.fromName("us-east-1");
}
