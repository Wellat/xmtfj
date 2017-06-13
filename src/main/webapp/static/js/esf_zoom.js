var chart31 = null;

// var base = +new Date(1968, 9, 3);
// var oneDay = 24 * 3600 * 1000;


// var data = [Math.random() * 300];
// var data2 = [Math.random() * 300+50];

// for (var i = 1; i < 200; i++) {
//     var now = new Date(base += oneDay);
//     date.push([now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'));
//     data.push(Math.round((Math.random() - 0.5) * 20 + data[i - 1]));
//     data2.push(Math.round((Math.random() - 0.5) * 20 + data2[i - 1]));
// }

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
        // data:['2017/06/12', '2017/06/09', '2017/06/08'],
        boundaryGap: false
    },
    yAxis: {
        name: '套数',
        type: 'value'
        // boundaryGap: [0, '100%']
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
    $.getJSON('/index/esf', function (data) {
        //上面这个url是重点，组成为：项目名/过滤前缀/Controller中mapping值，当页面加载此js时，它会向后台取数据
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

