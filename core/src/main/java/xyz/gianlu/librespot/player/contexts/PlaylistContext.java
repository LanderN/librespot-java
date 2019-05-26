package xyz.gianlu.librespot.player.contexts;

import org.jetbrains.annotations.NotNull;
import xyz.gianlu.librespot.common.proto.Spirc;
import xyz.gianlu.librespot.core.Session;
import xyz.gianlu.librespot.player.tracks.PlaylistProvider;
import xyz.gianlu.librespot.player.tracks.TracksProvider;

/**
 * @author Gianlu
 */
public final class PlaylistContext extends AbsTrackContext {
    @Override
    public @NotNull TracksProvider initProvider(@NotNull Session session, Spirc.State.@NotNull Builder state) {
        return new PlaylistProvider(session, state);
    }
}