package com.arxivvanity.application;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class ProxyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Intent intent = getIntent();
        final Uri arxivUri = intent.getData();

        final String paperId = arxivUri.getLastPathSegment()
                .replaceAll("\\.pdf", "");

        final String arxivVanityUrl = "https://www.arxiv-vanity.com/papers/" + paperId;

        final Intent openBrowserIntent =
                new Intent(Intent.ACTION_VIEW, Uri.parse(arxivVanityUrl));

        startActivity(openBrowserIntent);
        finish();

    }
}
