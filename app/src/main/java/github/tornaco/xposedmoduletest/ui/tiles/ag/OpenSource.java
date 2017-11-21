package github.tornaco.xposedmoduletest.ui.tiles.ag;

import android.content.Context;
import android.view.View;

import dev.nick.tiles.tile.QuickTile;
import dev.nick.tiles.tile.QuickTileView;
import github.tornaco.xposedmoduletest.R;
import github.tornaco.xposedmoduletest.ui.activity.WithWithCustomTabActivity;

/**
 * Created by guohao4 on 2017/11/10.
 * Email: Tornaco@163.com
 */

public class OpenSource extends QuickTile {

    public OpenSource(final Context context) {
        super(context);
        this.titleRes = R.string.title_open_source;
        this.iconRes = R.drawable.ic_code_white_24dp;
        this.tileView = new QuickTileView(context, this) {
            @Override
            public void onClick(View v) {
                super.onClick(v);
                WithWithCustomTabActivity withWithCustomTabActivity = (WithWithCustomTabActivity) context;
                withWithCustomTabActivity.navigateToWebPage(context.getString(R.string.app_source_url));
            }
        };
    }
}
