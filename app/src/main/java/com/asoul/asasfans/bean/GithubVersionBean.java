package com.asoul.asasfans.bean;


import java.util.List;

/**
 * @author: akari
 * @date: 2022/3/27
 * @description $
 */
public class GithubVersionBean {

    /**
     * url : https://api.github.com/repos/A-SoulFan/as-as-fans/releases/62859875
     * assets_url : https://api.github.com/repos/A-SoulFan/as-as-fans/releases/62859875/assets
     * upload_url : https://uploads.github.com/repos/A-SoulFan/as-as-fans/releases/62859875/assets{?name,label}
     * html_url : https://github.com/A-SoulFan/as-as-fans/releases/tag/AsAsFansv1.1.1
     * id : 62859875
     * author : {"login":"akarinini","id":72684331,"node_id":"MDQ6VXNlcjcyNjg0MzMx","avatar_url":"https://avatars.githubusercontent.com/u/72684331?v=4","gravatar_id":"","url":"https://api.github.com/users/akarinini","html_url":"https://github.com/akarinini","followers_url":"https://api.github.com/users/akarinini/followers","following_url":"https://api.github.com/users/akarinini/following{/other_user}","gists_url":"https://api.github.com/users/akarinini/gists{/gist_id}","starred_url":"https://api.github.com/users/akarinini/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/akarinini/subscriptions","organizations_url":"https://api.github.com/users/akarinini/orgs","repos_url":"https://api.github.com/users/akarinini/repos","events_url":"https://api.github.com/users/akarinini/events{/privacy}","received_events_url":"https://api.github.com/users/akarinini/received_events","type":"User","site_admin":false}
     * node_id : RE_kwDOHEiuRM4Dvypj
     * tag_name : AsAsFansv1.1.1
     * target_commitish : 77aa4ec2ecf30f36b9895ff586f73e0d683804b8
     * name : AsAsFans v1.1.1
     * draft : false
     * prerelease : false
     * created_at : 2022-03-27T05:07:49Z
     * published_at : 2022-03-27T05:39:28Z
     * assets : [{"url":"https://api.github.com/repos/A-SoulFan/as-as-fans/releases/assets/60726204","id":60726204,"node_id":"RA_kwDOHEiuRM4Dnpu8","name":"app-release.apk","label":null,"uploader":{"login":"akarinini","id":72684331,"node_id":"MDQ6VXNlcjcyNjg0MzMx","avatar_url":"https://avatars.githubusercontent.com/u/72684331?v=4","gravatar_id":"","url":"https://api.github.com/users/akarinini","html_url":"https://github.com/akarinini","followers_url":"https://api.github.com/users/akarinini/followers","following_url":"https://api.github.com/users/akarinini/following{/other_user}","gists_url":"https://api.github.com/users/akarinini/gists{/gist_id}","starred_url":"https://api.github.com/users/akarinini/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/akarinini/subscriptions","organizations_url":"https://api.github.com/users/akarinini/orgs","repos_url":"https://api.github.com/users/akarinini/repos","events_url":"https://api.github.com/users/akarinini/events{/privacy}","received_events_url":"https://api.github.com/users/akarinini/received_events","type":"User","site_admin":false},"content_type":"application/vnd.android.package-archive","state":"uploaded","size":7227859,"download_count":0,"created_at":"2022-03-27T05:39:07Z","updated_at":"2022-03-27T05:39:23Z","browser_download_url":"https://github.com/A-SoulFan/as-as-fans/releases/download/AsAsFansv1.1.1/app-release.apk"}]
     * tarball_url : https://api.github.com/repos/A-SoulFan/as-as-fans/tarball/AsAsFansv1.1.1
     * zipball_url : https://api.github.com/repos/A-SoulFan/as-as-fans/zipball/AsAsFansv1.1.1
     * body : 注意：目前已知手机chrome浏览器下载的apk无法在浏览器下载页面安装，需要到“文件管理”中找到apk源文件安装。（chrome浏览器会给apk加字段导致无法安装）
     */

    private String url;
    private String assets_url;
    private String upload_url;
    private String html_url;
    private int id;
    private AuthorBean author;
    private String node_id;
    private String tag_name;
    private String target_commitish;
    private String name;
    private boolean draft;
    private boolean prerelease;
    private String created_at;
    private String published_at;
    private String tarball_url;
    private String zipball_url;
    private String body;
    private List<AssetsBean> assets;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAssets_url() {
        return assets_url;
    }

    public void setAssets_url(String assets_url) {
        this.assets_url = assets_url;
    }

    public String getUpload_url() {
        return upload_url;
    }

    public void setUpload_url(String upload_url) {
        this.upload_url = upload_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AuthorBean getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBean author) {
        this.author = author;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public String getTarget_commitish() {
        return target_commitish;
    }

    public void setTarget_commitish(String target_commitish) {
        this.target_commitish = target_commitish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDraft() {
        return draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    public boolean isPrerelease() {
        return prerelease;
    }

    public void setPrerelease(boolean prerelease) {
        this.prerelease = prerelease;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public String getTarball_url() {
        return tarball_url;
    }

    public void setTarball_url(String tarball_url) {
        this.tarball_url = tarball_url;
    }

    public String getZipball_url() {
        return zipball_url;
    }

    public void setZipball_url(String zipball_url) {
        this.zipball_url = zipball_url;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<AssetsBean> getAssets() {
        return assets;
    }

    public void setAssets(List<AssetsBean> assets) {
        this.assets = assets;
    }

    public static class AuthorBean {
        /**
         * login : akarinini
         * id : 72684331
         * node_id : MDQ6VXNlcjcyNjg0MzMx
         * avatar_url : https://avatars.githubusercontent.com/u/72684331?v=4
         * gravatar_id :
         * url : https://api.github.com/users/akarinini
         * html_url : https://github.com/akarinini
         * followers_url : https://api.github.com/users/akarinini/followers
         * following_url : https://api.github.com/users/akarinini/following{/other_user}
         * gists_url : https://api.github.com/users/akarinini/gists{/gist_id}
         * starred_url : https://api.github.com/users/akarinini/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/akarinini/subscriptions
         * organizations_url : https://api.github.com/users/akarinini/orgs
         * repos_url : https://api.github.com/users/akarinini/repos
         * events_url : https://api.github.com/users/akarinini/events{/privacy}
         * received_events_url : https://api.github.com/users/akarinini/received_events
         * type : User
         * site_admin : false
         */

        private String login;
        private int id;
        private String node_id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(boolean site_admin) {
            this.site_admin = site_admin;
        }
    }

    public static class AssetsBean {
        /**
         * url : https://api.github.com/repos/A-SoulFan/as-as-fans/releases/assets/60726204
         * id : 60726204
         * node_id : RA_kwDOHEiuRM4Dnpu8
         * name : app-release.apk
         * label : null
         * uploader : {"login":"akarinini","id":72684331,"node_id":"MDQ6VXNlcjcyNjg0MzMx","avatar_url":"https://avatars.githubusercontent.com/u/72684331?v=4","gravatar_id":"","url":"https://api.github.com/users/akarinini","html_url":"https://github.com/akarinini","followers_url":"https://api.github.com/users/akarinini/followers","following_url":"https://api.github.com/users/akarinini/following{/other_user}","gists_url":"https://api.github.com/users/akarinini/gists{/gist_id}","starred_url":"https://api.github.com/users/akarinini/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/akarinini/subscriptions","organizations_url":"https://api.github.com/users/akarinini/orgs","repos_url":"https://api.github.com/users/akarinini/repos","events_url":"https://api.github.com/users/akarinini/events{/privacy}","received_events_url":"https://api.github.com/users/akarinini/received_events","type":"User","site_admin":false}
         * content_type : application/vnd.android.package-archive
         * state : uploaded
         * size : 7227859
         * download_count : 0
         * created_at : 2022-03-27T05:39:07Z
         * updated_at : 2022-03-27T05:39:23Z
         * browser_download_url : https://github.com/A-SoulFan/as-as-fans/releases/download/AsAsFansv1.1.1/app-release.apk
         */

        private String url;
        private int id;
        private String node_id;
        private String name;
        private Object label;
        private UploaderBean uploader;
        private String content_type;
        private String state;
        private int size;
        private int download_count;
        private String created_at;
        private String updated_at;
        private String browser_download_url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getLabel() {
            return label;
        }

        public void setLabel(Object label) {
            this.label = label;
        }

        public UploaderBean getUploader() {
            return uploader;
        }

        public void setUploader(UploaderBean uploader) {
            this.uploader = uploader;
        }

        public String getContent_type() {
            return content_type;
        }

        public void setContent_type(String content_type) {
            this.content_type = content_type;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getDownload_count() {
            return download_count;
        }

        public void setDownload_count(int download_count) {
            this.download_count = download_count;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getBrowser_download_url() {
            return browser_download_url;
        }

        public void setBrowser_download_url(String browser_download_url) {
            this.browser_download_url = browser_download_url;
        }

        public static class UploaderBean {
            /**
             * login : akarinini
             * id : 72684331
             * node_id : MDQ6VXNlcjcyNjg0MzMx
             * avatar_url : https://avatars.githubusercontent.com/u/72684331?v=4
             * gravatar_id :
             * url : https://api.github.com/users/akarinini
             * html_url : https://github.com/akarinini
             * followers_url : https://api.github.com/users/akarinini/followers
             * following_url : https://api.github.com/users/akarinini/following{/other_user}
             * gists_url : https://api.github.com/users/akarinini/gists{/gist_id}
             * starred_url : https://api.github.com/users/akarinini/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/akarinini/subscriptions
             * organizations_url : https://api.github.com/users/akarinini/orgs
             * repos_url : https://api.github.com/users/akarinini/repos
             * events_url : https://api.github.com/users/akarinini/events{/privacy}
             * received_events_url : https://api.github.com/users/akarinini/received_events
             * type : User
             * site_admin : false
             */

            private String login;
            private int id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(boolean site_admin) {
                this.site_admin = site_admin;
            }
        }
    }
}
