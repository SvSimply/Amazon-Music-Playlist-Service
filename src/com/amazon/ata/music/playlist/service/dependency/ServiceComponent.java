package com.amazon.ata.music.playlist.service.dependency;

import com.amazon.ata.music.playlist.service.activity.*;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DaoModule.class})
public interface ServiceComponent {
    DynamoDBMapper provideDynamoDBMapper();

    GetPlaylistActivity provideGetPlaylistActivity();
    AddSongToPlaylistActivity provideAddSongToPlaylistActivity();
    CreatePlaylistActivity provideCreatePlaylistActivity();
    GetPlaylistSongsActivity provideGetPlaylistSongsActivity();
    UpdatePlaylistActivity provideUpdatePlaylistActivity();

}
