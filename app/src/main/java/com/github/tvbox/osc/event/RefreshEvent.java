package com.github.tvbox.osc.event;

/**
 * @author pj567
 * @date :2021/1/6
 * @description:
 */
public class RefreshEvent {
    public static final int TYPE_PUSH_VOD = 99;
    public static final int TYPE_REFRESH = 0;
    public static final int TYPE_HISTORY_REFRESH = 1;
    public static final int TYPE_QUICK_SEARCH = 2;
    public static final int TYPE_QUICK_SEARCH_SELECT = 3;
    public static final int TYPE_QUICK_SEARCH_WORD = 4;
    public static final int TYPE_QUICK_SEARCH_WORD_CHANGE = 5;
    public static final int TYPE_SEARCH_RESULT = 6;
    public static final int TYPE_QUICK_SEARCH_RESULT = 7;
    public static final int TYPE_API_URL_CHANGE = 8;
    public static final int TYPE_PUSH_URL = 9;
    public static final int TYPE_DRIVE_REFRESH = 10;
    public static final int TYPE_LIVEPLAY_UPDATE = 11;
    public static final int TYPE_SUBTITLE_SIZE_CHANGE = 12;
    public static final int TYPE_LIVE_URL_CHANGE = 13;
    public static final int TYPE_EPG_URL_CHANGE = 14;
    public static final int TYPE_APP_REFRESH = 15;
    public static final int TYPE_FILTER_CHANGE = 16;
    public static final int TYPE_REFRESH_NOTIFY = 17;
    public int type;
    public Object obj;

    public RefreshEvent(int type) {
        this.type = type;
    }

    public RefreshEvent(int type, Object obj) {
        this.type = type;
        this.obj = obj;
    }
}