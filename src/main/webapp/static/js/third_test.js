var chart3 = null;

var option3 = {
    title : {
        text: '厦门市商品房交易信息',
        subtext: '数据来自厦门市国土资源与房产管理局',
        x: 'center',
        align: 'right'
    },
    series : [
        {
            type: 'map',
            map: 'xiamen'
        }
    ]
};


//载入图表
$(function () {
    chart3 = echarts.init(document.getElementById('third'));
    chart3.setOption(option3);
    window.addEventListener('resize', function () {
        chart3.resize();
    });
});

