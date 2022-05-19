package com.amazon.ata.music.playlist.service.dependency;

import com.amazon.ata.music.playlist.service.activity.*;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DaoModule.class})
public interface ServiceComponent {

    GetPlaylistActivity provideGetPlaylistActivity();
    AddSongToPlaylistActivity provideAddSongToPlaylistActivity();
    CreatePlaylistActivity provideCreatePlaylistActivity();
    GetPlaylistSongsActivity provideGetPlaylistSongsActivity();
    UpdatePlaylistActivity provideUpdatePlaylistActivity();

}
