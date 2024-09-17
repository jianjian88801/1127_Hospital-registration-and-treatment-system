const base = {
    get() {
        return {
            url : "http://localhost:8080/yiyuanguanhaojiuzhen/",
            name: "yiyuanguanhaojiuzhen",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/yiyuanguanhaojiuzhen/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院挂号就诊系统"
        } 
    }
}
export default base
