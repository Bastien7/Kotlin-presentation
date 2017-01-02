var connect             = require('gulp-connect'),
    del                 = require('del'),
    gulp                = require('gulp'),
    runSequence         = require('run-sequence');
	
require('./gulp/lint');
require('./gulp/sass');
require('./gulp/browserify');

gulp.task('clean', function (cb) {
    del(['./client-app/build/*'], cb);
});

gulp.task('serve', function() {

    connect.server({
        port: 8111,
        root: './client-app/build',
        livereload: true
    });

});

gulp.task('html', function(){
    gulp.src('./client-app/index.html')
        .pipe(gulp.dest('./client-app/build/'))
        .pipe(connect.reload());
});

gulp.task('fonts',  function(cb){
    gulp.src('./src/fonts/**/*.{eot,svg,ttf,woff,woff2}')
        .pipe(gulp.dest('./demo/build/fonts/'));
    cb();
});

gulp.task('watch', ['watchify'], function(cb) {
    gulp.watch(['./client-app/js/**/*.js', './client-app/js/**/*.jsx',
		 './client-app/js/*.jsx'
	], ['lint-dev']);
    gulp.watch(['./client-app/css/**/*.scss', './client-app/css/*.scss'], ['sass-dev']);
    gulp.watch('./client-app/index.html', ['html']);
    cb();
});

gulp.task('default', function(cb){
    runSequence(
        'clean',
        'lint-dev',
        ['sass-dev', 'html', 'fonts'],
        'watch',
        'serve',
        cb
    );
});