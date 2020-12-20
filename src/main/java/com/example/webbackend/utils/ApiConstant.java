package com.example.webbackend.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class ApiConstant {

    private static final String ROOT_PATH = "api/v1";

    public static final String USER = ROOT_PATH + "/user";

    public static final String COMMENTS = ROOT_PATH + "/comments";

    public static final String FILM = ROOT_PATH + "/film";
}
