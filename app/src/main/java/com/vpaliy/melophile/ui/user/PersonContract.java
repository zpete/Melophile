package com.vpaliy.melophile.ui.user;

import android.support.annotation.NonNull;

import com.vpaliy.domain.model.Playlist;
import com.vpaliy.domain.model.Track;
import com.vpaliy.melophile.ui.base.BasePresenter;
import com.vpaliy.melophile.ui.base.BaseView;

import java.util.List;

public interface PersonContract {

    interface View extends BaseView<Presenter> {
        void attachPresenter(@NonNull Presenter presenter);
        void showAvatar(String avatarUrl);
        void showTracks(List<Track> tracks);
        void showPlaylists(List<Playlist> playlists);
        void showEmptyMessage();
        void showErrorMessage();
    }

    interface Presenter extends BasePresenter<View> {
        void attachView(@NonNull View view);
        void stop();
        void start(String id);
    }
}
