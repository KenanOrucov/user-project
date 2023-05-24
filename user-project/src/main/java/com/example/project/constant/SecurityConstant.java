package com.example.project.constant;

public class SecurityConstant {
    public static final long EXPIRATION_TIME = 432_000_000; //5 days expressed in  milliseconds (tokenin yasama vaxti)
    public static final String TOKEN_PREFIX = "Bearer ";  //tokene verende header bu olsa yeni yoxlanis aparilmayacaq
    public static final String JWT_TOKEN_HEADER = "Jwt-Token";
    public static final String TOKEN_CANNOT_BE_VERIFIED = "Token cannot be verified";
    public static final String GET_ARRAYS_LLC = "Get Arrays, LLC";
    public static final String GET_ARRAYS_ADMINISTRATION = "User Management Portal";  //admini yoxlayir
    public static final String AUTHORITIES = "authorities";//userlerin authoritisi bu stringle oturulecek
    public static final String FORBIDDEN_MESSAGE = "You need to log in to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
//    public static final String[] PUBLIC_URLS = {"/user/login", "/user/register", "/user/resetpassword/**", "/user/image/**"};
    public static final String[] PUBLIC_URLS = { "**" };


}
