/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.tvleanback.model;

import android.content.Intent;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;
import java.util.List;

import com.example.android.tvleanback.ui.PlaybackActivity;
import com.example.android.tvleanback.ui.PlaybackFragment;
import com.example.android.tvleanback.ui.MainFragment;
import com.example.android.tvleanback.ui.VideoDetailsActivity;

import static android.app.PendingIntent.getActivity;


/**
 * Manages a playlist of videos.
 */
public class Playlist {

    private List<Video> playlist;
    private int currentPosition;
    private PlaybackFragment playbackFragment;
    private MainFragment mainFragment;
    private FragmentActivity fragmentActivity;


    public Playlist() {
        playlist = new ArrayList<>();
        currentPosition = 0;

    }

    /**
     * Clears the videos from the playlist.
     */
    public void clear() {
        playlist.clear();
    }

    /**
     * Adds a video to the end of the playlist.
     *
     * @param video to be added to the playlist.
     */
    public void add(Video video) {
        playlist.add(video);
    }

    /**
     * Sets current position in the playlist.
     *
     * @param currentPosition
     */
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    /**
     * Returns the size of the playlist.
     *
     * @return The size of the playlist.
     */
    public int size() {
        return playlist.size();
    }

    /**
     * Moves to the next video in the playlist. If already at the end of the playlist, null will
     * be returned and the position will not change.
     *
     * @return The next video in the playlist.
     */
    public Video next() {

        if ((currentPosition + 1) < size()) {
            currentPosition++;
            return playlist.get(currentPosition);
        }
        return null;
    }

    /**
     * Moves to the previous video in the playlist. If the playlist is already at the beginning,
     * null will be returned and the position will not change.
     *
     * @return The previous video in the playlist.
     *
     */
    public Video previous() {

        //Video anterior;
        //anterior = playbackFragment.VideoAnterior();
        //playbackFragment.play(anterior);
        //Toast.makeText(mainFragment.getActivity(), anterior.toString(), Toast.LENGTH_SHORT).show();
        //Intent intent = new Intent(playbackFragment.getActivity(), PlaybackActivity.class);
        //intent.putExtra(VideoDetailsActivity.VIDEO, anterior);
        //getActivity().finish();

        //playbackFragment.getActivity().startActivity(intent);
        //playbackFragment.play(anterior);



        if (currentPosition - 1 >= 0) {
            currentPosition--;
            return playlist.get(currentPosition);
        }
        return null;


        //return playlist.get(anterior);
    }
}