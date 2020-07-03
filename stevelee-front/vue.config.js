module.exports = {
  lintOnSave: false,
  transpileDependencies: ['vuetify'],
  configureWebpack: {
    entry: ['babel-polyfill', './src/main.js']
  },
  devServer: {
    proxy: {
      'api': {
        target: 'http://localhost:8095',
        changeOrigin: true,
        pathRewrite: {
          '^/api': ''
        }
      }
    },
    proxy: {
      'st_user': {
        target: 'http://localhost:8094',
        changeOrigin: true,
        pathRewrite: {
          '^/st_user': ''
        }
      }
    }
  }
}
