package response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ThreadResponse(
    @SerialName("advert_bottom_image")
    var advertBottomImage: String,
    @SerialName("advert_bottom_link")
    var advertBottomLink: String,
    @SerialName("advert_mobile_image")
    var advertMobileImage: String,
    @SerialName("advert_mobile_link")
    var advertMobileLink: String,
    @SerialName("advert_top_image")
    var advertTopImage: String,
    @SerialName("advert_top_link")
    var advertTopLink: String,
    var board: BoardResponse,
    @SerialName("board_banner_image")
    var boardBannerImage: String,
    @SerialName("board_banner_link")
    var boardBannerLink: String,
    @SerialName("current_thread")
    var currentThread: Int,
    @SerialName("files_count")
    var filesCount: Int,
    @SerialName("is_board")
    var isBoard: Boolean,
    @SerialName("is_closed")
    var isClosed: Int,
    @SerialName("is_index")
    var isIndex: Boolean,
    @SerialName("max_num")
    var maxNum: Int,
    @SerialName("posts_count")
    var postsCount: Int,
    @SerialName("thread_first_image")
    var threadFirstImage: String,
    var threads: List<Thread>,
    var title: String,
    @SerialName("unique_posters")
    var uniquePosters: Int,
) {
    @Serializable
    class BoardResponse(
        @SerialName("bump_limit")
        var bumpLimit: Int,
        var category: String,
        @SerialName("default_name")
        var defaultName: String,
        @SerialName("enable_dices")
        var enableDices: Boolean,
        @SerialName("enable_flags")
        var enableFlags: Boolean,
        @SerialName("enable_icons")
        var enableIcons: Boolean,
        @SerialName("enable_likes")
        var enableLikes: Boolean,
        @SerialName("enable_names")
        var enableNames: Boolean,
        @SerialName("enable_oekaki")
        var enableOekaki: Boolean,
        @SerialName("enable_posting")
        var enablePosting: Boolean,
        @SerialName("enable_sage")
        var enableSage: Boolean,
        @SerialName("enable_shield")
        var enableShield: Boolean,
        @SerialName("enable_subject")
        var enableSubject: Boolean,
        @SerialName("enable_thread_tags")
        var enableThreadTags: Boolean,
        @SerialName("enable_trips")
        var enableTrips: Boolean,
        @SerialName("file_types")
        var fileTypes: List<String>,
        var id: String,
        var info: String,
        @SerialName("info_outer")
        var infoOuter: String,
        @SerialName("max_comment")
        var maxComment: Int,
        @SerialName("max_files_size")
        var maxFilesSize: Int,
        @SerialName("max_pages")
        var maxPages: Int,
        var name: String,
        @SerialName("threads_per_page")
        var threadsPerPage: Int,
    )

    @Serializable
    data class Thread(
        val posts: List<PostResponse>,
    ) {
        @Serializable
        data class PostResponse(
            var banned: Int,
            var board: String,
            var closed: Int,
            var comment: String,
            var date: String,
            var email: String,
            var endless: Int,
            var files: List<FileResponse>?,
            var lasthit: Long,
            var name: String,
            var num: Int,
            var number: Int,
            var op: Int,
            var parent: Int,
            var sticky: Int,
            var subject: String,
            var tags: String? = null,
            var timestamp: Long,
            var trip: String,
            var views: Int,
        ) {
            @Serializable
            data class FileResponse(
                @SerialName("displayname")
                var displayName: String,
                var duration: String? = null,
                @SerialName("duration_secs")
                var durationSecs: Int? = null,
                @SerialName("fullname")
                var fullName: String,
                var height: Int,
                var md5: String,
                var name: String,
                var path: String,
                var size: Int,
                var thumbnail: String,
                @SerialName("tn_height")
                var thumbnailHeight: Int,
                @SerialName("tn_width")
                var thumbnailWidth: Int,
                var type: Int,
                var width: Int,
            )
        }
    }
}
