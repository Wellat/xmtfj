var chart31 = null;

option31 = {
    tooltip: {
        trigger: 'axis',
        position: function (pt) {
            return [pt[0], '10%'];
        }
    },
    title: {
        left: 'left',
        text: '二手房成交量走势图'
    },
    legend: {
        data:['成交住宅套数','成交总套数'],
        x: 'right'
    },
    xAxis: {
        type: 'category',
        boundaryGap: false
    },
    yAxis: {
        name: '套数',
        type: 'value'
    },
    dataZoom: [{
        show: true,
        realtime: true,
        start: 50,
        end: 100
        },
        {
            show: true,
            type: 'inside',//slide
            realtime: true,
            start: 50,
            end: 100
        }],
    series: [
        {
            name:'成交住宅套数',
            type:'line',
            smooth:true,
            symbol: 'none',
            sampling: 'average',
            itemStyle: {
                normal: {
                    color: 'rgb(255, 70, 131)'
                }
            },
            areaStyle: {
                normal: {
                    color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                        offset: 0,
                        color: 'rgb(255, 158, 68)'
                    }, {
                        offset: 1,
                        color: 'rgb(255, 70, 131)'
                    }])
                }
            }

        },
        {
            name:'成交总套数',
            type:'line',
            smooth:true,
            symbol: 'none',
            sampling: 'average',
            itemStyle: {
                normal: {
                    color: 'rgb(100, 70, 131)'
                }
            },
            areaStyle: {
                normal: {
                    color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                        offset: 0,
                        color: 'rgb(100, 158, 68)'
                    }, {
                        offset: 1,
                        color: 'rgb(100, 70, 131)'
                    }])
                }
            }
        }
    ]
};

function loadEsf() {
    $.getJSON('/xmtfj/index/esf', function (data) {
        if (data.state) {
            chart31.showLoading({text: '正在努力的读取数据中...'});

            chart31.setOption({
                xAxis: [{
                    data: data.esfDate
                }],
                series: [
                    {
                        data:data.esfHouseNum
                    },
                    {
                        data:data.esfTotalNum
                    }
                ]
            });

            chart31.hideLoading();
        }else {
            alert('提示', data.msg);
        }
    });

}

//载入图表
$(function () {
    chart31 = echarts.init(document.getElementById('chart3_1'));
    chart31.setOption(option31);
    loadEsf();
    window.addEventListener('resize', function () {
        chart31.resize();
    });
});

