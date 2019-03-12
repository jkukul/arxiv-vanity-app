A tiny Android app which automagically redirects [arXiv](https://arxiv.org/) 
pdf links to [arXiv Vanity](https://www.arxiv-vanity.com).  

<a href='https://play.google.com/store/apps/details?id=com.arxivvanity.application&utm_source=github'>
    <img width="240px" 
         alt='Get it on Google Play' 
         src='https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png'/>
</a>

## Why?

Opening an [arXiv](https://arxiv.org/) pdf link on mobile is not very convenient. 
The resulting pdf download is often slow, clutters your phone and the reading experience
you get is not optimised for your device. On the other hand, 
[arXiv Vanity](https://www.arxiv-vanity.com) renders papers from [arXiv](https://arxiv.org/)
as responsive web pages, so you don't have to deal with pdfs.

## Browser compatibility

There are two types of arXiv pdf URLs that you can encounter: URLs ending with `.pdf` 
which point directly to pdf documents and URLs without the extension which 
redirect to the former type. Due to different ways of how mobile browsers handle 
[Android Intents](https://developer.android.com/guide/components/intents-filters), 
the behaviour of the app can differ depending on which browser you are using 
and is summarised in the table below.

Which URLs are redirected to arXiv Vanity depending on
 a combination of URL type and browser: 

| URL example \ Browser(s) | [Chromium](https://github.com/chromium/chromium)-based | Firefox |
| --- | --- | --- |
| https://arxiv.org/pdf/PAPER_ID | ✅ | ✅ |
| https://arxiv.org/pdf/PAPER_ID.pdf | ❌ | ✅ | 
